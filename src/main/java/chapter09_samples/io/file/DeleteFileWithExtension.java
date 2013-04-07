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

import java.io.File;
import java.io.FilenameFilter;

/**
 * Description of this file.
 *
 * @author XiongNeng
 * @version 1.0
 * @since 13-3-29
 */
public class DeleteFileWithExtension {
    private static final String FILE_DIR = "c:\\folder";
    private static final String FILE_TEXT_EXT = ".txt";

    public static void main(String args[]) {
        new DeleteFileWithExtension().deleteFile(FILE_DIR, FILE_TEXT_EXT);
    }

    public void deleteFile(String folder, String ext) {

        GenericExtFilter filter = new GenericExtFilter(ext);
        File dir = new File(folder);

        //list out all the file name with .txt extension
        String[] list = dir.list(filter);

        if (list.length == 0) return;

        File fileDelete;

        for (String file : list) {
            String temp = new StringBuffer(FILE_DIR)
                    .append(File.separator)
                    .append(file).toString();
            fileDelete = new File(temp);
            boolean isdeleted = fileDelete.delete();
            System.out.println("file : " + temp + " is deleted : " + isdeleted);
        }
    }

    //inner class, generic extension filter
    private class GenericExtFilter implements FilenameFilter {

        private String ext;

        public GenericExtFilter(String ext) {
            this.ext = ext;
        }

        public boolean accept(File dir, String name) {
            return (name.endsWith(ext));
        }
    }
}
