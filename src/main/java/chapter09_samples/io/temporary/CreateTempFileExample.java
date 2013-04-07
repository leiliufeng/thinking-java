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
package chapter09_samples.io.temporary;

/**
 * Description of this file.
 *
 * @author XiongNeng
 * @version 1.0
 * @since 13-3-29
 */

import java.io.File;
import java.io.IOException;

public class CreateTempFileExample {
    public static void main(String[] args) {
        try {
            //create a temp file
            File temp = File.createTempFile("temp-file-name", ".tmp");
            System.out.println("Temp file : " + temp.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}