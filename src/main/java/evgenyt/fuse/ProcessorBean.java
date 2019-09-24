package evgenyt.fuse;

import org.apache.camel.Exchange;

/**
 * Processor bean
 * @author tey
 *
 */

public class ProcessorBean {
	
	// Exchange manipulations can be done here
	public void process(Exchange exch) {
		exch.getIn().setBody("wuha");
	}
}
