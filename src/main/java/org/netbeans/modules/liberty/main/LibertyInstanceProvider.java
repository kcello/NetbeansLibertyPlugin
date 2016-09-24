/*
 * Copyright 2016 Netbeans Liberty Plugin.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.netbeans.modules.liberty.main;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ChangeListener;
import org.netbeans.api.server.ServerInstance;
import org.netbeans.spi.server.ServerInstanceProvider;

/**
 * Provides instance in Services window. Registered in layer.xml file.
 *
 * @author gwieleng
 */
public class LibertyInstanceProvider implements ServerInstanceProvider {

    private static final String TEST_SERVER_NAME = "WebSphere Liberty";

    private static final String TEST_RUNTIME_LOC = "C:\\myLibertyInstallPath\\wlp";

    @Override
    public List<ServerInstance> getInstances() {
        List<ServerInstance> instances = new ArrayList<ServerInstance>();

        //TODO: Listen to registration entries created in user directory
        //using FileChangeListener and refresh here
        //to create an instance:
        //Dummy implementation
//        ServerInfo serverInfo = new ServerInfo(new File(TEST_RUNTIME_LOC + "\\usr"), null, TEST_SERVER_NAME, TEST_RUNTIME_LOC,
//                new File(System.getProperty("java.home")), 7777, true);
//        ServerInstance instance = ServerInstanceFactory.createServerInstance(
//                new LibertyInstanceImplementation(this, serverInfo));
//        instances.add(instance);

        return instances;
    }

    @Override
    public void addChangeListener(ChangeListener listener) {
    }

    @Override
    public void removeChangeListener(ChangeListener listener) {
    }

}
