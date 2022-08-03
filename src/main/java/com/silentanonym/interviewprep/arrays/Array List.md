# Array List

### Initialize,

```
List<Integer> v0 = new ArrayList<>();
List<Integer> v1;                           // v1 == null
```

### Convert Array to ArrayList,

```
Integer[] a = {0, 1, 2, 3, 4};
v1 = new ArrayList<>(Arrays.asList(a));
```

### Copy,

```
List<Integer> v2 = v1;                      // another reference to v1
List<Integer> v3 = new ArrayList<>(v1);     // make an actual copy of v1
```

### Length,

```
System.out.println("The size of v1 is: " + v1.size());
```

### Access/Get an element,

```
System.out.println("The first element in v1 is: " + v1.get(0));
```

### Iteration,

```
// For Loop
for (int i = 0; i < v1.size(); ++i) {
    System.out.print(" " + v1.get(i));
}

// For-Each Loop
for (int item : v1) {
    System.out.print(" " + item);
}
```

### Update an element,

```
v2.set(0, 5);       // modify v2 will actually modify v1
System.out.println("The first element in v1 is: " + v1.get(0));
v3.set(0, -1);
System.out.println("The first element in v1 is: " + v1.get(0));
```

### Sorting,

```
Collections.sort(v1);
```

### Add an element,

```
v1.add(-1);
v1.add(1, 6);
```

### Delete/Remove an element,

```
v1.remove(v1.size() - 1); // Delete the last element
```

## Reference,

- [LeetCode - Introduction to Dynamic Array](https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1146/)
