/*
 * Created on 13-3-29
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 * 
 * Copyright @2013 the original author or authors.
 */
package chapter09_samples.io.directory;

/**
 * Description of this file.
 *
 * @author XiongNeng
 * @version 1.0
 * @since 13-3-29
 */

import java.io.File;

public class DisplayDirectoryAndFile {

    public static void main(String args[]) {
        displayIt(new File("C:\\Downloads"));
    }

    public static void displayIt(File node) {
        System.out.println(node.getAbsoluteFile());
        if (node.isDirectory()) {
            String[] subNote = node.list();
            for (String filename : subNote) {
                displayIt(new File(node, filename));
            }
        }
    }
}
