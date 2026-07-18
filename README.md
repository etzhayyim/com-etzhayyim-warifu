# warifu 割符

Standalone actor repository for guarded zero-fee card authorization,
settlement, refunds, and disputes.

Canonical actor metadata and owned contracts are EDN (`manifest.edn`,
`lex/*.edn`). External compatibility contracts are isolated under
`wire/lex/*.json`. Runtime code lives under `src/warifu`, tests under
`test/warifu`. Run the full suite with `bb test`.
