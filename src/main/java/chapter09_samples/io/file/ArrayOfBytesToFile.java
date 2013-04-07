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
package chapter09_samples.io.file;

/**
 * Description of this file.
 *
 * @author XiongNeng
 * @version 1.0
 * @since 13-3-29
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ArrayOfBytesToFile {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        File file = new File("C:\\testing.txt");

        byte[] bFile = new byte[(int) file.length()];

        try {
            //convert file into array of bytes
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(bFile);
            fileInputStream.close();

            //convert array of bytes into file
            FileOutputStream fileOuputStream = new FileOutputStream("C:\\testing2.txt");
            fileOuputStream.write(bFile);
            fileOuputStream.close();

            System.out.println("Done");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
