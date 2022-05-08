apply(plugin = "kotlin-spring")
apply(plugin = "org.springframework.boot")

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("de.codecentric:spring-boot-admin-starter-client:2.5.1")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}