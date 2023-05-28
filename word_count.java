public class MapReduce 
{
    @SuppressWarnings("empty-statement")
    public static void main(String[] args)
    {
        List <string> inputList = Arrays.asList{
        "Bus","Car","Bus","Car","Train","Car",
        "Bus","Car","Train","Bus","TRAIN","BUS",
        "Bus","Car","CAR","CAR","BUS","Train"
    };
    
    Map<String, Long> wordCount=inputList.parallelStram().collect(Collectors.groupByConcurrent(w -> w,Collectors.counting()));
    wordCount.forEach((word,count)-> System.out.println(count+word+":"));
    }
    
}
