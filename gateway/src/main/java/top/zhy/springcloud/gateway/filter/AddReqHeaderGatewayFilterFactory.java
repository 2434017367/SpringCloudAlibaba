package top.zhy.springcloud.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.factory.AbstractNameValueGatewayFilterFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.springframework.cloud.gateway.support.GatewayToStringStyler.filterToStringCreator;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/2/8 16:58
 *
 * 自定义gateway过滤器，根据参数增加请求头
 */
@Component
public class AddReqHeaderGatewayFilterFactory extends AbstractNameValueGatewayFilterFactory {

    @Override
    public GatewayFilter apply(NameValueConfig config) {
        return new GatewayFilter() {
            @Override
            public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
                Set<Map.Entry<String, List<String>>> entries = exchange.getRequest().getQueryParams().entrySet();
                if (!entries.isEmpty()) {
                    Map.Entry<String, List<String>> next = entries.iterator().next();
                    String key = next.getKey();
                    List<String> values = next.getValue();
                    if (!values.isEmpty()) {
                        String value = values.get(0);
                        if (StringUtils.hasText(value)) {
                            exchange.getRequest().mutate().header(key, value);
                        }
                    }
                }
                return chain.filter(exchange);
            }

            @Override
            public String toString() {
                return filterToStringCreator(AddReqHeaderGatewayFilterFactory.this)
                        .append(config.getName(), config.getValue()).toString();
            }
        };
    }

}
