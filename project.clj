(defproject cljs-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojurescript "0.0-2740"]]
  :plugins [[lein-cljsbuild "1.0.4"]]
  :cljsbuild {
              :builds {
                       :main {
                              :source-path "src/cljs"
                              :compiler {
                                         :output-to "main.js"
                                         :optimizations :simple
                                         :pretty-print true}}}})
