package app

import annotations.NotBlank
import data.CreateCategoryRequest
import data.CreateProductRequest
import exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

//Manual Validation
fun validateRequest(request: CreateProductRequest) {
    if (request.id == "") {
        throw ValidationException("Id is blank")
    }

    if (request.name == "") {
        throw ValidationException("Name is blank")
    }
}

fun validateRequest(request: CreateCategoryRequest) {
    if (request.id == "") {
        throw ValidationException("Id is blank")
    }

    if (request.name == "") {
        throw ValidationException("Name is blank")
    }
}

fun validateRequestReflection(request: Any) {
    val clazz = request::class
    val properties = clazz.memberProperties

    for (property in properties) {
        if (property.findAnnotation<NotBlank>() != null) {
//            val value: String = property.call(request) as String // ini akan error bila tipenya bukan String

            when (val value = property.call(request)) {
                is String -> {
                    if ("" == value) {
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }
}

fun main() {
    val request = CreateProductRequest("1", "Indomie", 2000)
    validateRequestReflection(request)

    val request2 = CreateCategoryRequest("F", "Food")
    validateRequestReflection(request2)
    //1 Function bisa digunakan untuk beberapa data class
}