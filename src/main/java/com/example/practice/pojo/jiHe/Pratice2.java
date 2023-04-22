package com.example.practice.pojo.jiHe;

import com.example.practice.pojo.jiHe.Student;
import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * @description: 集合操作
 * @author: chunyan.li
 * @time: 2023/3/6 19:49
 */
public class Pratice2 {
    public static void main(String[] args) {
        /*List<String> list1 = Arrays.asList("aa", "ff", "dd");
        //String 类自身已实现Compareable接口
        list1.stream().sorted().forEach(System.out::println);// aa dd ff*/


        /****************************************************************/
        /*Student s1 = new Student("aa", 10);
        Student s2 = new Student("bb", 40);
        Student s3 = new Student("aa", 80);
        Student s4 = new Student("dd", 50);
        List<Student> studentList = Arrays.asList(s1, s2, s3, s4);
        //自定义排序：先按姓名升序，姓名相同则按年龄升序
        studentList.stream().sorted(
                (o1, o2) -> {
                    if (o1.getName().equals(o2.getName())) {
                        return o1.getAge() - o2.getAge();
                    } else {
                        return o1.getName().compareTo(o2.getName());
                    }
                }
        ).forEach(System.out::println);*/


        /****************************************************************/
        /*Student s1 = new Student("aa", 10);
        Student s2 = new Student("bb", 40);
        Student s3 = new Student("aa", 80);
        Student s4 = new Student("dd", 50);
        List<Student> studentList = Arrays.asList(s1, s2, s3, s4);

        studentList.stream()
                .peek(o -> o.setAge(100))
                .forEach(System.out::println);*/


        /****************************************************************/
        /*List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

        boolean allMatch = list2.stream().allMatch(e -> e > 10); //false
        boolean noneMatch = list2.stream().noneMatch(e -> e > 10); //true
        boolean anyMatch = list2.stream().anyMatch(e -> e > 4);  //true

        Integer findFirst = list2.stream().findFirst().get(); //1
        Integer findAny = list2.stream().findAny().get(); //1

        long count1 = list2.stream().count(); //5
        Integer max = list2.stream().max(Integer::compareTo).get(); //5
        Integer min = list2.stream().min(Integer::compareTo).get(); //1*/


        /****************************************************************/
        Student s1 = new Student("aa", 10,1);
        Student s2 = new Student("bb", 20,2);
        Student s3 = new Student("cc", 10,3);
        Student s4 = new Student("dd", 11,1);
        Student s5 = new Student("ee", 22,2);
        Student s6 = new Student("dd", 13,3);
/*        List<Student> list = Arrays.asList(s1, s2, s3);

        //装成list
        List<Integer> ageList = list.stream().map(Student::getAge).collect(Collectors.toList()); // [10, 20, 10]

        //转成set
        Set<Integer> ageSet = list.stream().map(Student::getAge).collect(Collectors.toSet()); // [20, 10]

        //转成map,注:key不能相同，否则报错
        Map<String, Integer> studentMap = list.stream().collect(Collectors.toMap(Student::getName, Student::getAge)); // {cc=10, bb=20, aa=10}

        //字符串分隔符连接
        String joinName = list.stream().map(Student::getName).collect(Collectors.joining(",", "(", ")")); // (aa,bb,cc)

        //聚合操作
        //1.学生总数
        Long count = list.stream().collect(Collectors.counting()); // 3
        //2.最大年龄 (最小的minBy同理)
        Integer maxAge = list.stream().map(Student::getAge).collect(Collectors.maxBy(Integer::compare)).get(); // 20
        //3.所有人的年龄
        Integer sumAge = list.stream().collect(Collectors.summingInt(Student::getAge)); // 40
        //4.平均年龄
        Double averageAge = list.stream().collect(Collectors.averagingDouble(Student::getAge)); // 13.333333333333334
        // 带上以上所有方法
        DoubleSummaryStatistics statistics = list.stream().collect(Collectors.summarizingDouble(Student::getAge));
        System.out.println("count:" + statistics.getCount() + ",max:" + statistics.getMax() + ",sum:" + statistics.getSum() + ",average:" + statistics.getAverage());

        //分组
        Map<Integer, List<Student>> ageMap = list.stream().collect(Collectors.groupingBy(Student::getAge));
        //多重分组,先根据类型分再根据年龄分
        Map<Integer, Map<Integer, List<Student>>> typeAgeMap = list.stream().collect(Collectors.groupingBy(Student::getType, Collectors.groupingBy(Student::getAge)));

        //分区
        //分成两部分，一部分大于10岁，一部分小于等于10岁
        Map<Boolean, List<Student>> partMap = list.stream().collect(Collectors.partitioningBy(v -> v.getAge() > 10));

        //规约
        Integer allAge = list.stream().map(Student::getAge).collect(Collectors.reducing(Integer::sum)).get(); //40*/

        List<Student> list3 = Arrays.asList(s1, s2, s3, s4, s5, s6);
        //拆分：将目标集合按照传入的size分组
        List<List<Student>> partition = Lists.partition(list3, 2);
    }
}
