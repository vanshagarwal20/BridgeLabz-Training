package practice_problems;

import java.util.*;

class Version {
    String version;
    int size;

    Version(String version, int size) {
        this.version = version;
        this.size = size;
    }
}

public class VersionControlledStorage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, List<Version>> map = new HashMap<>();

        for(int i = 0; i < n; i++){

            String line = sc.nextLine();
            String[] parts = line.split(" ");

            String operation = parts[0];

            if(operation.equals("UPLOAD")){

                String file = parts[1];
                String version = parts[2];
                int size = Integer.parseInt(parts[3]);

                map.putIfAbsent(file, new ArrayList<>());

                boolean exists = false;

                for(Version v : map.get(file)){
                    if(v.version.equals(version)){
                        exists = true;
                        break;
                    }
                }

                if(!exists){
                    map.get(file).add(new Version(version, size));
                }
            }

            else if(operation.equals("FETCH")){

                String file = parts[1];

                if(!map.containsKey(file)){
                    System.out.println("File Not Found");
                    continue;
                }

                List<Version> list = new ArrayList<>(map.get(file));

                Collections.sort(list, (a,b) -> {
                    if(a.size != b.size)
                        return a.size - b.size;
                    return a.version.compareTo(b.version);
                });

                for(Version v : list){
                    System.out.println(file + " " + v.version + " " + v.size);
                }
            }

            else if(operation.equals("LATEST")){

                String file = parts[1];

                if(!map.containsKey(file) || map.get(file).isEmpty()){
                    System.out.println("File Not Found");
                    continue;
                }

                List<Version> list = map.get(file);
                Version v = list.get(list.size() - 1);

                System.out.println(file + " " + v.version + " " + v.size);
            }

            else if(operation.equals("TOTAL_STORAGE")){

                String file = parts[1];

                if(!map.containsKey(file)){
                    System.out.println("File Not Found");
                    continue;
                }

                int total = 0;

                for(Version v : map.get(file)){
                    total += v.size;
                }

                System.out.println(file + " " + total);
            }
        }
    }

}
