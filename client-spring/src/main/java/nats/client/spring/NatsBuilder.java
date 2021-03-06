/*
 *   Copyright (c) 2013 Intellectual Reserve, Inc.  All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package nats.client.spring;

import nats.client.NatsConnector;
import org.springframework.context.ApplicationEventPublisher;

/**
 * Convenience class for creating a {@link nats.client.Nats} instances that will publish Spring application events
 *
 * @author Mike Heath <elcapo@gmail.com>
 */
public class NatsBuilder extends NatsConnector {

	public NatsBuilder(ApplicationEventPublisher applicationEventPublisher) {
		addConnectionStateListener(new ApplicationEventPublishingConnectionStateListener(applicationEventPublisher));
	}

}
