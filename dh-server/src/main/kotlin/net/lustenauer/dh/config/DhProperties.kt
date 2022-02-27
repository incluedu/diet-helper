package net.lustenauer.dh.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "dh")
data class DhProperties(
    // TODO: 27.02.2022 change when use or remove
    val placeHolder: String = "something"
)
