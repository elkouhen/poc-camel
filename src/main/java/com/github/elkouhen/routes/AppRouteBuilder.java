package com.github.elkouhen.routes;

import lombok.extern.log4j.Log4j;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.javaconfig.SingleRouteCamelConfiguration;
import org.springframework.stereotype.Component;

@Log4j
@Component
public class AppRouteBuilder extends SingleRouteCamelConfiguration {

	public AppRouteBuilder() {
		super();
	}

	@Override
	public RouteBuilder route() {
		// TODO Auto-generated method stub
		return new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				from("direct:bookBlo").beanRef("bookBloImpl");
				from("direct:transactionBlo").beanRef("transactionBloImpl");

				from("timer://timer1?period=1000").process(new Processor() {
					public void process(Exchange exchange) throws Exception {

						exchange.getOut().setHeader("id", "id1");
						exchange.getOut().setHeader("amount", "100");;
					}
				}).to("direct:bookBlo");

			}
		};
	}
}
