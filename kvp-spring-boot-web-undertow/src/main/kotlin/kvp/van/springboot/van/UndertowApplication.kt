package kvp.van.springboot.van

import io.undertow.servlet.api.SecurityConstraint
import io.undertow.servlet.api.SecurityInfo
import io.undertow.servlet.api.TransportGuaranteeType
import io.undertow.servlet.api.WebResourceCollection
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.embedded.undertow.UndertowDeploymentInfoCustomizer
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory
import org.springframework.boot.web.servlet.server.ServletWebServerFactory
import org.springframework.context.annotation.Bean

@SpringBootApplication
class UndertowApplication {
//    @Bean
//    fun serverFactory(): ServletWebServerFactory {
//        val factory = UndertowServletWebServerFactory()
//        factory.addBuilderCustomizers({ builder -> builder.addHttpListener(8080, "0.0.0.0") })
//
//        factory.addDeploymentInfoCustomizers(UndertowDeploymentInfoCustomizer { deploymentInfo ->
//            deploymentInfo.addSecurityConstraint(
//                SecurityConstraint().addWebResourceCollection(WebResourceCollection().addUrlPattern("/*"))
//                    .setTransportGuaranteeType(TransportGuaranteeType.CONFIDENTIAL)
//                    .setEmptyRoleSemantic(SecurityInfo.EmptyRoleSemantic.PERMIT)
//            ).setConfidentialPortManager { 8443 }
//        });
//        return factory
//    }
}

fun main(args: Array<String>) {
    SpringApplication.run(UndertowApplication::class.java, *args)
}

