### Properties of code

#### Correctness.

Correctness is, so far as I can see, the only _necessary_
  property of "good" code.  There are two kinds of correctness:

* Syntactic.  Strictly speaking, syntactically incorrect code is not
    code at all.
* Semantic.  Code can be syntactically correct but do the wrong
    thing.  There's a subtlety here: by itself, code _defines_ its own
    correctness.  If it produces an output that _you_ think is
    incorrect, it is not because the code operated incorrectly or made
    a mistake; code cannot make a mistake, any more than a falling
    apple can mistakenly violate the laws of physics.  So we need two
    notions of semantic correctness:
  * Computational correctness.  This just means that the computation
  of a piece of code is defined by that very code.
  * Pragmatic correctness.  A piece of code is pragmatically correct
  when its computation does what it was _supposed_ to do.  This is a
  normative notion of correctness that allows for the possibility of
  incorrectness.

The criteria of pragmatic correctness _cannot_ be specified by the
code itself.  To determine correctness, we need a (semantic)
_specification_ to go with the definition.  Such a specification can
only be expressed separately from the code itself.

> TODO: inductive definitions and proofs, and why a separate
> specification is needed even then (if it is).  Paragigmatic example:
> adding one to a natural number yields "the next" natural number.  An
> inductive definition of `add` would express this very idea as a
> definition.  Proof of correctness in this case related to
> definition, and computational correctness is same as semantic
> correctness.  How this relates to external semantic specification
> needs to be explicated.  Use of "same" language for specification
> and definition?  To illustrate, use distinctive language to specify
> semantics without `n` and `n+1`.

The practical point: when you define a function in Clojure, you write
down its signature (name plus arguments) and its implementation.  This
alone is not enough to determine correctness.  The semantic
correctness specification is inevitably expressed in informal natural
language, since Clojure does not support a formal specification
language.  Usually this is the job of the docstring, but is often
elaborated in comments or external documentation.

Needless to say, with an informal semantic specification it is not
possible to algorithmically determine the pragmatic correctness of the
code.  Ideally, we would have a formally defined specification
language, with formal semantics, along with a proof system that would
allow us to formally prove the correctness of the code.  With such a
formal specification we would no longer need the informal
specification, although we might still want to include some
explanatory prose to help the human reader understand the point of the
code.

Of course, we still need to establish the semantic correctness of
code, even in the absence of formal specifications and correctness
proofs.  There are two common approaches to this.  One is expert
inspection of the code.  If the code is simple enough, this is usually
sufficient.  The other approach is commonly known as "unit testing".

Etc.  Unit testing can serve as a kind of partial proof technique, but
it can also be exploited to provide more rigorous, expressive
documentation.

The sort of idea I want to explore involves using a formal
specification language (specifically Z) to express semantic
correctness criteria, using the unit test as a sort of partial-proof
technique, and using some kind of markup/typesetting mechanism to
support better "documentation", both formal and informal.  For
Clojure, this is really more of an exercise in reconceptualization
than a technical innovation, since it seems unlikely that Clojure will
incorporate formal proof support any time soon.  On the other hand,
with core.typed and core.logic, Clojure has taken significant steps in
the direction of proof support; we should be able to exploit these
capabilities to implement some kind of mechanisms that would move us
further in the direction of formal specification and correctness
proof.

> There are two aspects to this, the formal and the informal.  On the
> informal side, the expectation (or hope) is that use of some kind of
> (quasi-)formal notation for specifying semantic correctness
> criteria, and conceptualizing (and writing) unit test code as a kind
> of proof, will lead to a clear improvement in other desireable
> properties e.g. clarity, simplicity, etc. and so solve part of "the
> documentation problem" in a way that contrasts sharply with the
> Literate Programming approach.  Or rather, we should say that this
> is the research question: does doing things in this "proofy" manner
> result in something better than LP?

### Clarity

### Efficiency

### Etc.
