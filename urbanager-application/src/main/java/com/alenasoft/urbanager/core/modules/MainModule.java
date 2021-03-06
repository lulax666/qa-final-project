package com.alenasoft.urbanager.core.modules;

import com.alenasoft.urbanager.UrbanagerConf;
import com.alenasoft.urbanager.resources.example.service.ExampleService;
import com.alenasoft.urbanager.resources.example.service.ExampleServiceImpl;
import com.alenasoft.urbanager.resources.operations.service.OperationService;
import com.alenasoft.urbanager.resources.operations.service.OperationServiceImpl;
import com.alenasoft.urbanager.resources.primenumber.service.PrimeNumberService;
import com.alenasoft.urbanager.resources.primenumber.service.PrimeNumberServiceImpl;
import ru.vyarus.dropwizard.guice.module.support.DropwizardAwareModule;

/**
 * This class should define the main bindings for dependency injection.
 *
 * @author Luis Roberto Perez
 * @since 20-05-17
 */
public class MainModule extends DropwizardAwareModule<UrbanagerConf> {
  @Override
  protected void configure() {
    bind(ExampleService.class).to(ExampleServiceImpl.class);
    bind(OperationService.class).to(OperationServiceImpl.class);
    bind(PrimeNumberService.class).to(PrimeNumberServiceImpl.class);
  }
}
