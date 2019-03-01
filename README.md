# Simply Tuples
A small open-source project that add tuples to Java in a simple way.

## Notes
- This is a very fresh project, it may has continues big changes.
- The project supports `Tuple0` - `Tuple5` (0-5 elements per tuple) and will not add support for larger tuples `?`,
since we believe that it is better after that to build and use your custom classes.

#### TODO
- Documentation
- Methods:
  - **from** to builder. Build bigger tuples using smaller ones
  - merge / expand
  - `?` push (alias to append) / pop (alias to removeLast)
- `?` Support `Tuple6` - `Tuple9`
- Check Apache common, Scala tuples and 'javatuples' implementations.
