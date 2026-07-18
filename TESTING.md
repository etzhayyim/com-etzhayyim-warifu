# Testing

Run all standalone suites:

```sh
bb test
```

The suite covers authorize, capture, settle, refund, dispute, EAVT schema,
guarded substrate, canonical EDN lexicons, external wire JSON compatibility,
and repository layout contracts.

For the JVM repository contract:

```sh
clojure -M:test
```
