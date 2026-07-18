(require '[clojure.test :as t])

(def suites
  '[warifu.cells.test-refund
    warifu.cells.test-authorize
    warifu.cells.test-capture
    warifu.cells.test-settle
    warifu.cells.test-dispute
    warifu.cells.test-eavt-schema
    warifu.cells.test-guarded-substrate
    warifu.test-lexicons
    warifu.repository-contract-test])

(apply require suites)
(let [{:keys [fail error]} (apply t/run-tests suites)]
  (when-not (zero? (+ fail error))
    (System/exit 1)))
