# Conditional logic
## If

## Switch
Compatible types:
- byte, char, short, int
- Byte, Character, Short, Integer
- String
- enum's
boolean, long, float and double won't work

Default case can be placed anywhere. It's only executed if no matching case was found.

## Loop
### Break and continue
<dl>
  <dt>continue;</dt>
  <dd>Skips to the next iteration.</dd>
  <dd>Can only be used in loops.</dd>
  <dt>break;</dt>
  <dd>Exits the entire loop. </dd>
  <dd>Can be used in loops and switches.</dd>
</dl>

#### Labelled break and continue
Are used to indicate which of the nested loops you want to exit from or which of the nested loops you want to skip the next iteration
Example:
```java
OUTERLOOP:
for(...){
    for(...){
        break OUTERLOOP;
        }
}
```

### Enhanced for loop
Can loop through arrays of any type