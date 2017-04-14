package com.dipen;

import com.dipen.dao.OrderDao;
import com.dipen.service.OrderService;
import com.dipen.service.OrderServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

/**
 * Created by dipen on 4/13/2017.
 */
public class OrderServiecImplTest {
    //manually inject mocks
    //OrderServiceImpl orderServiceImpl;
    //Annotation of auto inject mocks
    @InjectMocks
    OrderServiceImpl orderServiceImpl = new OrderServiceImpl();
    @Mock
    OrderDao orderDao;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        //manually inject mocks
        //orderServiceImpl = new OrderServiceImpl();
        //orderServiceImpl.setOrderDao(orderDao);
        Mockito.when(orderDao.processOrder()).thenReturn(true);
    }

    @Test
    public void processOrder() throws Exception {

        //orderServiceImpl.processOrder();
        //System.out.print( orderServiceImpl.processOrder());

        assertTrue(orderServiceImpl.processOrder());
        Mockito.verify(orderDao).processOrder();
    }

}