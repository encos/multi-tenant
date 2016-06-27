package org.encos.customer2.mlt.service;

import org.encos.mlt.dto.OrderDto;
import org.encos.mlt.service.IOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Enrico Costanzi
 */
@Service
@Primary
public class CustomerOrderService implements IOrderService{

    Logger logger = LoggerFactory.getLogger(CustomerOrderService.class);

    @Override
    public List<OrderDto> getOrders() {
        logger.info("Hello I'm the customer 2 order service!");
        return null;
    }
}
