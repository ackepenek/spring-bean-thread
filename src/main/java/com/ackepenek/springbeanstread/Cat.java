package com.ackepenek.springbeanstread;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Profile(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Cat extends Animal {
 // do nothing
}
