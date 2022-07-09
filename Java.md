# Java

### Tutorials,
 - [Programiz](https://www.programiz.com/java-programming/hello-world)
 - [Google Style Guide](https://google.github.io/styleguide/javaguide.html)

[Data Types](https://www.javatpoint.com/java-data-types)
There are two types of data types in Java:

Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.<br>
Non-primitive data types: The non-primitive data types include Classes, Interfaces, String, and Arrays.

[Keywords](https://www.javatpoint.com/java-keywords)<br>
```
abstract	continue	for	new	switch assert	default	goto	package	synchronized boolean	
do	if	private	this break	double	implements	protected	throw byte	else	import	
public	throws case	enum	instanceof	return	transient catch	extends	int	short	try 
char	final	interface	static	void class	finally	long	strictfp	volatile const	
float	native	super	while
```
[Control Statements](https://www.javatpoint.com/control-flow-in-java)
```
if(condition) {
  // executes when condition is true
}
```
```
if(condition) {
  // code if condition is true
} else {
  //code if condition is false
}
```
```
switch(expression) {    
  case value1:
    // code to be executed;    
    break; // optional  
  case value2:    
    // code to be executed;    
    break;  // optional  
  ......    
    
default:     
  code to be executed if all cases are not matched;  
}
```
```
for(initialization; condition; increment/decrement) {
  // statement or code to be executed    
}

for(data_type variable : array_name) {
  // code to be executed
}
```
```
while (condition) {
  // code to be executed   
  Increment / decrement statement  
}

do {
  // code to be executed / loop body  
  // update statement   
} while (condition);
```

| Class         | Method     | Description |
|--------------|-----------|------------|
| [Math](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html) | max(int a, int b)      | Returns the greater of two int values.  | 
| [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)      | valueOf  |        |
|       | substring  |        |
|       | contains  |        |
|       | char[] toCharArray()  | Converts this string to a new character array.       |