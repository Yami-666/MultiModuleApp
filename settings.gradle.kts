rootProject.name = "MultiModuleApp"

include(
    ":app",
    ":core",
    ":data",
    ":domain",
    ":presentation",
    ":models",
    ":features",
    ":features:myapplication"
)