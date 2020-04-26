import java.io.File;
    import java.io.FilenameFilter;

    public class ListOutFilesInDir {
        public static void main(String[] args) throws Exception {

            File[] fileList = getFileList("C:\\Program Files (x86)\\Jenkins\\workspace\\groovy-file-iterations");

            for(File file : fileList) {
                System.out.println(file.getName());
            }
        }

        private static File[] getFileList(String dirPath) {
            File dir = new File(dirPath);   

            File[] fileList = dir.listFiles(new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    return name.endsWith(".png");
                }
            });
            return fileList;
        }
    }