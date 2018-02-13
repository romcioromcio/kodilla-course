package com.kodilla.good.patterns.challenges.work1;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService (final InformationService informationService,
                                final OrderService orderService, final OrderRepository orderRepository ){
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process (final OrderRequest orderRequest) {
        boolean isOrder = orderService.numberOrder(orderRequest.getOrder());

        if (isOrder) {
            informationService.information(orderRequest.getCustomer().getLastName());
            orderRepository.createOrder(orderRequest.getOrder(), orderRequest.getCustomer(), orderRequest.getLocalDateTime());
            return new OrderDto(orderRequest.getOrder().getNumberOrder(), true);
        }
        return new OrderDto(orderRequest.getOrder().getNumberOrder(), false);
    }
}
