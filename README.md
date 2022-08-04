demonstration of the spring beans scope (for thread safety)

if profile is *prototype*
```
Runner1 - 1
Runner2 - 1
Runner2 - 2
Runner1 - 2
Runner2 - 3
Runner2 - 4
Runner1 - 3
Runner2 - 5
Runner2 - 6
```


if profile is *singleton*
```
Runner1 - 1
Runner2 - 2
Runner2 - 3
Runner1 - 4
Runner2 - 5
Runner2 - 6
Runner1 - 7
Runner2 - 8
Runner2 - 9
```