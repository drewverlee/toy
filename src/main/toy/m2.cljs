(ns toy.m2
  (:require [toy.m1 :as m1]))


;; m1/* -> no matches

;; eval m1/blah => "blah"

;;  m1/*  -> finds /blh

;; Note this isn't the same behavior i see in my project in that evaling the var e.g `m1/blah`  doesnt lead to completion matches on next try. But this does at least demonstrate an issue.
