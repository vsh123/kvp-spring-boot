apply(plugin = "kotlin-spring")
apply(plugin = "org.springframework.boot")

dependencies {
    implementation(project(":kvp-spring-boot-starter"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-data-redis")
    implementation("org.postgresql:postgresql")
    implementation("org.flywaydb:flyway-core")
//    implementation("mysql:mysql-connector-java")
    runtimeOnly("com.h2database:h2")
    implementation("org.webjars.bower:jquery:3.6.0")
//    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}