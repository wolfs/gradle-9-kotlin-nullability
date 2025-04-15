import org.gradle.api.provider.Provider
import org.gradle.api.provider.ProviderFactory

open class BuildParametersExtension(private val providers: ProviderFactory) {
    enum class BuildParameter {
        SOME_PARAMETER;

        val projectProperty = "$PREFIX$name"
    }

    companion object {
        const val PREFIX = "param."
    }

    private inline fun <reified T : Enum<T>> enumParameter(parameter: BuildParameter): Provider<T> =
        providers.gradleProperty(parameter.projectProperty).map { enumValueOf(it.uppercase()) }
}
