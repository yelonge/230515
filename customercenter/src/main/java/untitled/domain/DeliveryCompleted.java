package untitled.domain;

import java.util.*;
import lombok.Data;
import untitled.infra.AbstractEvent;

@Data
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private String userId;
    private String orderId;
    private String productId;
    private String productName;
    private Long qty;
    private String status;
    private String courier;
}
