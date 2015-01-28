(defproject lein-cljsbuild-example "1.2.3"
  :dependencies [[org.clojure/clojurescript "0.0-2727"]]
  :plugins [[lein-cljsbuild "1.0.4"]]
  :cljsbuild {
              :builds [{
                        :source-paths ["src-cljs"]
                        :compiler {
                                   :output-to "bin/main.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}]})
