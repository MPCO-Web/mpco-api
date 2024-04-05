import org.springdoc.core.GroupedOpenApi
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig {

    @Bean
    fun customOpenAPI(): OpenAPI {
        return OpenAPI()
                .info(Info().title("SpringBoot Practice Rest API Documentation")
                        .description("SpringBoot Rest API practice")
                        .version("0.1"))
    }

    // 추가적으로, API 그룹화나 다른 고급 설정을 위해 GroupedOpenApi 인스턴스를 생성할 수 있습니다.
    @Bean
    fun apiGroup(): GroupedOpenApi {
        return GroupedOpenApi.builder()
                .group("example")
                .packagesToScan("com.mpco") // 대상 패키지 설정
                .build()
    }
}