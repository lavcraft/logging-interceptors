package org.cxf.interceptor.test;

import lombok.Builder;
import lombok.Data;

/**
 * @author tolkv
 * @since 16/08/15
 */
@Data
@Builder
public class RequestWithDNestedObject {
  private NestedObject nested;
  private String rootProperty;
}
