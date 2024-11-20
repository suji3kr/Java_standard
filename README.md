
	         
## 자바의 정석 2 



* ### MVC2모델


오늘사진 


--------
* ####  통화 표시 
>* java : DecimalFormat
>* jsp  :  JSTL -> <fmt:


<br/><br/><br/> 
#### List 중복 가능 /   Set 중복 불가   /  Map  키, 값의 데이터 집합 

<br/><br/><br/>
11/13사진




    package ch11.sec06;
    
    import java.util.ArrayList;
    import java.util.LinkedList;
    import java.util.List;
    
    public class ArrayListLinkedListTest2 {
      public static void main(String[] args) {
    
        List al = new ArrayList(1000000);
        List ll = new LinkedList();
        add(al);
        add(ll);
        System.out.println("= 접근시간 테스트 =");
        System.out.println("ArrayList : " + access(al));
        System.out.println("LinkedList : " + access(ll));
      }
    
      public static void add(List list) {
        for(int i =0; i<100000; i++) list.add(i+" ");
      }
    
      public static long access(List list) {
        long start = System.currentTimeMillis();
        for(int i =0; i<10000; i++)list.get(i);
        long end = System.currentTimeMillis();
        return end - start;
      }
    }

>* = 접근시간 테스트 =
>* ArrayList : 1
>* LinkedList : 235

<br/><br/>
* ### map.put

* ### list.add

	    package ch11.sec31;
	    import java.util.*;
	    public class HashMap2 {
	      public static void main(String[] args) {
	        Map map = new HashMap();
  			// 앞쪽 Map과 뒤쪽 HashMap을 다르게 표기, 언제든 다른 구현체로 변경 .//객체지향  (부 - 모)
	        map.put("김자바", (100));
	        map.put("이자바", (100));
	        map.put("강자바", (80));
	        map.put("안자바", (90));
	    
	        Set set = map.entrySet();
	        Iterator it = set.iterator();
	  
	        while(it.hasNext()) {
	          Map.Entry e = (Map.Entry)it.next();
	          System.out.println("이름 :" + e.getKey() + ",점수: " + e.getValue());
	        }
	  
	        set = map.keySet();
	        System.out.println("참가자 명단 :" + set);
	      
	        Collection values = map.values();
	        it = values.iterator();
	        int total =0;
	      
	        while(it.hasNext()) {
	          Integer i = (Integer)it.next();
	          total += i.intValue();
	        }
	  
	        System.out.println("총점 : " + total);
	        System.out.println("평균 : " + (float)total/set.size());
	        System.out.println("최고점수 : " + Collections.max(values));
	        System.out.println("최저점수 : " + Collections.min(values));
	      }
	    }




* ### List list<String> = new ArrayList<>(); 정형
* ### Map map<String> = new HashMap<>(); 비정형

정형비정형 이미지 
