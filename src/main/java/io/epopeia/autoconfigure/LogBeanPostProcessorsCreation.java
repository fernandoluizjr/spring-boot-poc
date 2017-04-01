package io.epopeia.autoconfigure;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogBeanPostProcessorsCreation implements BeanPostProcessor {

	private static Log logger = LogFactory.getLog(LogBeanPostProcessorsCreation.class);

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		logger.info("Initializing bean '" + beanName + "'");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		logger.info("Bean '" + beanName + "' created : " + bean.toString());
		return bean;
	}
}
