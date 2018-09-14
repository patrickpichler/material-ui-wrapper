(defproject material-ui-wrapper "0.1.0"
  :description "Small wrapper around cljsjs/material-ui for usage with reagent"
  
  :url "http://example.com/FIXME"

  :license {:name "The MIT License"
            :url "https://opensource.org/licenses/MIT"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.10.339"]
                 [reagent "0.8.1"]
                 [cljsjs/material-ui "1.4.0-0" :exclusions [[cljsjs/react]
                                                            [cljsjs/react-dom]]]])
