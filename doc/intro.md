# Introduction

## Basic Concepts

* function
* signature
* structure
* proof
* denotation
* construction
* etc.

## Thinking about functions

The central concept of functional programming languages is,
presumably, the function.  But there are many ways to think about
functions; many concepts to which the word may refer.

At the foundational level, we have at least three distinct approaches
to the "foundations of mathematics".  A foundation of mathematics is a
theory from which, in principle, all of mathematics can be derived.

* [Set theory](http://plato.stanford.edu/entries/set-theory/) (ST)
  "appeared almost out of nowhere" in a paper 1945 paper by Eilenberg
  & Mac Lane.  It grew out or researches in algebra.  From the ST
  perspective, a function is a special kind of set of ordered pairs;
  no more, no less.  This concept does not involve any notion of
  computation.
* [Category theory](http://plato.stanford.edu/entries/category-theory/) (CT)
 originated from research in algebra in the 1940s, although it was not
 realized until the 1960s(?) that CT could serve as a foundational
 framework.
* [Homotopy Type Theory](http://homotopytypetheory.org/book/) (HoTT)
  is a (very) recent entrant, "based on a recently discovered
  connection between homotopy theory and type theory."

In addition, we have a variety of models of computation, under which
various notions of function may be in play - most obviously, the
lambda calculus depends critically on a particular notion of function
as a "lambda abstraction".

In practical programming functions are usually treated in relative
isolation.  A function takes and input and returns an output; the
focus is on what the function does to/with the input in order to
produce the output.  This reflects an implicit machine-like notion of
function as a kind of black-box transforming device.

But algebra offers an alternative concept.  This is where the concepts
of signature and structure play a central role.  The focus is not on
the individual function as a mechanism, but on the entire structure
and the relations among its parts.
