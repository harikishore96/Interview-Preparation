# Arrays

### Initialize,

```
int[] numbers = {10, 20, 30, 40};
int[] numbers = new int[]{10, 20, 30, 40};
int[] numbers = new int[10];
int[] a0 = new int[5];
int[] a1 = {1, 2, 3};
```

### Access/Get an element,

```
int[] numbers = {10, 20, 30, 40};
System.out.println(numbers[0]);
System.out.println("The first element is: " + a1[0]);
```

### Update an element,

```
numbers[0] = 11;
a1[0] = 4;
```

### Delete/Remove an element,

```
numbers[0] = 0;
```

### Iteration,

```
// For-Each Loop
for(int number : numbers) {
    System.out.println(number);
}

// For Loop
for (int i = 0; i < a1.length; ++i) {
    System.out.print(" " + a1[i]);
}
```

### Searching,

```
// Binary Search
Arrays.sort(numbers);
Arrays.binarySearch(numbers, 6);
```

### Sorting,

```
Arrays.sort(a1);
```

### Length,

```
System.out.println(numbers.length);
System.out.println("The size of a1 is: " + a1.length);
```

## Reference,

- [LeetCode - Introduction to Array](https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1143/)
