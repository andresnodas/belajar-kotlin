package annotations

@Target(
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD,
)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Beta

class ExampleTarget(
    //Kita bisa melakukan secara specific lokasi dari annotation
    @param:Beta val firstName: String,
    @get:Beta val middleName: String,
    @field:Beta val lastName: String,
)