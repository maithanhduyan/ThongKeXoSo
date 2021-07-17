package com.anmtd.component;

import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DatatableRequest {

    private static final int NOT_AVALABLE = -1;

    private static final int DEFAULT_VALUE = 0;

    private static final String BLANK = "";

    private Map<String, String> dataRequest;

    public DatatableRequest() {

    }

    /**
     * @param dataRequest the dataRequest to set
     */
    public void setDataRequest(Map<String, String> dataRequest) {
	this.dataRequest = dataRequest;
    }

}
