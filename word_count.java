import java.util.Arrays;
public class MapReduce 
{
    
    public static void main(String[] args)
    {
        List <string> inputList = Arrays.asList{
        "Bus","Car","Bus","Car","Train","Car",
        "Bus","Car","Train","Bus","TRAIN","BUS",
        "Bus","Car","CAR","CAR","BUS","Train"
    };
    
    Map<String, Long> wordCount=inputList.parallelStram().collect(Collectors.groupbyConcurrent(w -> w,Collectors.counting()));
    wordCount.forEach((<any> word,<any> count)-> System.out.println(count+word+":"));
    }
    
}
