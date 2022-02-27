package net.lustenauer.dh.config

import net.lustenauer.dh.config.Configuration.Companion.DH_PACKAGE
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = [DH_PACKAGE])
@EnableConfigurationProperties(value = [DhProperties::class])
class Configuration {
    companion object {
        const val DH_PACKAGE = "net.lustenauer.dh"
    }
}
