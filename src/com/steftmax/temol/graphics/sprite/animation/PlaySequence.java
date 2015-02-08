package com.steftmax.temol.graphics.sprite.animation;

public interface PlaySequence {
	
	public static PlaySequence REPEAT = new PlaySequence() {
		
		@Override
		public int getFrame(AnimationState data, int framesPassed, int frames) {
			
			data.lastFrame += framesPassed;

			data.lastFrame %= frames;

			return data.lastFrame;
		}
	};

	public int getFrame(AnimationState data, int framesPassed, int frames);
}