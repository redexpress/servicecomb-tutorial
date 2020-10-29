package io.github.redexpress.math;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Hello {
    String message;
    String name;
    String instanceId;
}
