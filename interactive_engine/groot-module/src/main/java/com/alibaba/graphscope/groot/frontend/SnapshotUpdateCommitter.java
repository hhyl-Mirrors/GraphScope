/*
 * Copyright 2020 Alibaba Group Holding Limited.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.graphscope.groot.frontend;

import com.alibaba.graphscope.groot.rpc.ChannelManager;
import com.alibaba.graphscope.groot.rpc.RoleClients;
import com.alibaba.maxgraph.common.RoleType;

// wrapper to create SnapshotUpdateClient by getting channel of Coordinator
public class SnapshotUpdateCommitter extends RoleClients<SnapshotUpdateClient> {
    public SnapshotUpdateCommitter(ChannelManager channelManager) {
        super(channelManager, RoleType.COORDINATOR, SnapshotUpdateClient::new);
    }

    public void updateSnapshot(int frontendId, long snapshotId) throws RuntimeException {
        getClient(0).updateSnapshot(frontendId, snapshotId);
    }
}
