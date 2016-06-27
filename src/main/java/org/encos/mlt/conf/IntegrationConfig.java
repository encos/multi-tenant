package org.encos.mlt.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Enrico Costanzi
 */
@Configuration
@Import(CustomerImportSelector.class)
public class IntegrationConfig {

}
