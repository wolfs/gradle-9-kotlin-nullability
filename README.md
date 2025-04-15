# Gradle 9 / Kotlin build logic

When running sync, you get the following error:

```
> Task :build-logic:compileKotlin FAILED
8 actionable tasks: 1 executed, 7 up-to-date
e: file:///Users/wolfs/projects/gradle/test-tryout/kotlin-nullability/build-logic/src/main/kotlin/com/some/company/BuildParametersExtension.kt:16:9 New inference error [NewConstraintError at Incorporate TypeVariable(T) == T? from Fix variable T from position Fix variable T: T? <!: kotlin/Enum<TypeVariable(T)>].

```

[Build Scan](https://ge.gradle.org/s/t6eyqubt257gg)
