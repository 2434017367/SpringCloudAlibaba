package top.zhy.springcloud.gateway.predicate;

import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.cloud.gateway.handler.predicate.GatewayPredicate;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.server.ServerWebExchange;

import javax.validation.constraints.NotEmpty;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/2/8 15:28
 *
 * 自定义断言工厂
 */
@Component
public class ChecknameRoutePredicateFactory extends AbstractRoutePredicateFactory<ChecknameRoutePredicateFactory.Config> {

    /**
     * name key.
     */
    public static final String NAME_KEY = "name";

    public ChecknameRoutePredicateFactory() {
        super(ChecknameRoutePredicateFactory.Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList(NAME_KEY);
    }

    @Override
    public Predicate<ServerWebExchange> apply(ChecknameRoutePredicateFactory.Config config) {
        return new GatewayPredicate() {
            @Override
            public boolean test(ServerWebExchange exchange) {
                return "name".equals(config.name);
            }
        };
    }

    @Validated
    public static class Config {

        @NotEmpty
        private String name;

        public String getName() {
            return name;
        }

        public ChecknameRoutePredicateFactory.Config setName(String name) {
            this.name = name;
            return this;
        }
    }

}

